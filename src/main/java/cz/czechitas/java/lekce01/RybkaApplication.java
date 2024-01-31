package cz.czechitas.java.lekce01;

import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import cz.czechitas.java.playground.CzechitasGameApplication;
import cz.czechitas.java.playground.Kamen;
import cz.czechitas.java.playground.Rybka;
import javafx.scene.paint.Color;

public class RybkaApplication extends CzechitasGameApplication {
  private Rybka rybka;
  private Kamen kamen;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  protected void initSettings(GameSettings settings) {
    settings.setNative(true);
    settings.setWidth(800);
    settings.setHeight(600);
    settings.setTitle("Rybka Radana");
    settings.setVersion("1.0");
  }

  @Override
  protected void initGame() {
    FXGL.getGameScene().setBackgroundColor(Color.AQUA);
    super.initGame();
  }

  @Override
  protected void onStart() {
    kamen = new Kamen(200, 200);
    rybka = new Rybka(100, 100);
    int delka = 20;
    for (int i = 0; i < delka; i++) {
      //chci aby rybka poplavala doprava o proměnnou délka
      rybka.plavatVpravo();
    }
    for (int i = 0; i < delka; i++) {
      //chci aby rybka poplavala doprava o proměnnou délka
      rybka.plavatDolu();
    }
    for (int i = 0; i < delka; i++) {
      //chci aby rybka poplavala doprava o proměnnou délka
      rybka.plavatVlevo();
    }
    for (int i = 0; i < delka; i++) {
      //chci aby rybka poplavala doprava o proměnnou délka
      rybka.plavatNahoru();
    }
  }
}
