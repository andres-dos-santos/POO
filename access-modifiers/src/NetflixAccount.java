public class NetflixAccount {
  private String preferredLanguage;
  private String screenResolution;

  void entry() {
    fetchUserPreferences();
    identifyResolution();
  }

  private void fetchUserPreferences() {
    preferredLanguage = "pt-br";
  }

  private void identifyResolution() {
    screenResolution = "Full-HD";
  }

  private void loadFilmAudio() {
    if (preferredLanguage == "pt-br" || preferredLanguage == "en-us") {
      System.out.println("Áudio: " + preferredLanguage);
    } else {
      System.out.println("Áudio: en-us");
    }
  }

  public void watchMovie(String movieName) {
    System.out.println("Iniciando o filme" + movieName);
    System.out.println("Resolução: " + screenResolution);

    loadFilmAudio();
  }
}
