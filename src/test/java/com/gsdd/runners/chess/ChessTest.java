package com.gsdd.runners.chess;

import static org.assertj.core.api.Assertions.assertThat;

import com.gsdd.actions.chess.ChessNavigateSteps;
import com.gsdd.actions.chess.ChessSteps;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
class ChessTest {

  @Steps ChessNavigateSteps navigate;
  @Steps ChessSteps actions;

  @Test
  void goToSolveChessPuzzlesSection() {
    navigate.opensTheHomePage();
    actions.scrollToPuzzles();

    Serenity.reportThat(
        "Solve Chess Puzzles Section exists",
        () -> assertThat(actions.checkSolveChessPuzzlesSection()).isNotEmpty().contains("GM"));
  }

  @Test
  void loadPlayBotSection() {
    navigate.opensTheHomePage();
    actions.clickToPlayBot();

    Serenity.reportThat(
        "Play Bot Section exists",
        () -> assertThat(actions.checkBotSection()).isNotEmpty().hasSize(1));
  }
}
