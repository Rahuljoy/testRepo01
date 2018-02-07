package com.example.rahul.gamechooser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class GameChooser extends AppCompatActivity {

    TextView gameListTextView;
    Button findGameButton;
    Spinner spinner;
    FindGame findGameClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_chooser);
        gameListTextView = (TextView) findViewById(R.id.gameListTextView);
        findGameButton = (Button) findViewById(R.id.findGameButton);
        spinner = (Spinner) findViewById(R.id.categorySpinner);
        findGameClass = new FindGame();


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.category, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }

    public void findGame(View view) {

        int index = findGameClass.getCategoryIndex(spinner.getSelectedItem().toString());
        gameListTextView.setText(findGameClass.getGames(index));

    }
}