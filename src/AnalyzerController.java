public class AnalyzerController {

  private final Analyzer analyzer;

  public String getCurrentVideoId() {
    return currentVideoId;
  }

  public void setCurrentVideoId(String currentVideoId) {
    this.currentVideoId = currentVideoId;
  }

  String currentVideoId = "";
  boolean paused = false;

  public AnalyzerController() {
   this.analyzer = new Analyzer();
  }

  public void numberOfVideos() {
//    System.out.printf("%s videos in the library%n", analyzer.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("showAllVideos needs implementation");
  }

  public void playVideo(String videoId) {
    setCurrentVideoId(videoId);
//    System.out.println("Playing video: "+ analyzer.getVideo(videoId).getTitle());
  }

  public void stopVideo() {
    //Check if a video is currently playing
    if (getCurrentVideoId().isEmpty()){
      System.out.println("Cannot stop video: No video is currently playing");
    }else{
//      System.out.println("Stopping video: "+ analyzer.getVideo(getCurrentVideoId()).getTitle());
      setCurrentVideoId("");

    }

  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    //Check if video has been paused else pause it

    if(!paused){
//      System.out.println("Pausing video: "+ analyzer.getVideo(getCurrentVideoId()).getTitle());
      paused = true;
    }else {
//      System.out.println("Video already paused: "+ analyzer.getVideo(getCurrentVideoId()).getTitle());
    }
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}