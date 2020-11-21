

<style>

  html, body, iframe, #wrap-player, .video-container, #player{
      width:100%;
      height:100%;
      margin:0px;
      overflow:hidden;
  }
  </style>
  
  <div id='wrap-player'>
      <div class="video-container">
          <div id="player"></div>
      </div> 
  </div>
  
  
  <script>
  
  var tag = document.createElement('script');
  
  tag.src = "https://www.youtube.com/iframe_api";
  var firstScriptTag = document.getElementsByTagName('script')[0];
  firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);
  
  // 3. This function creates an <iframe> (and YouTube player)
  //    after the API code downloads.
  var player;
  function onYouTubeIframeAPIReady() {
      player = new YT.Player('player', {
          playerVars: {
  
              enablejsapi: 1,
              disablekb: 1,
              showinfo: 0,
              controls: 1,
              fs: 0,
              
          },
          height: '100%',
          width: '100%',
          videoId: 'BNOZ9g0LbS4',
          events: {
              'onReady': onPlayerReady,
              'onStateChange': onPlayerStateChange
          }
      });
  }
  
  // 4. The API will call this function when the video player is ready.
  function onPlayerReady(event) {
      event.target.playVideo();
  }
  
  // 5. The API calls this function when the player's state changes.
  //    The function indicates that when playing a video (state=1),
  //    the player should play for six seconds and then stop.
  var done = false;
  function onPlayerStateChange(event) {
      if (event.data == YT.PlayerState.PLAYING && !done) {
         // setTimeout(stopVideo, 6000);
          //done = true;
      }
  }
  function stopVideo() {
      player.stopVideo();
  }
  
  </script>
