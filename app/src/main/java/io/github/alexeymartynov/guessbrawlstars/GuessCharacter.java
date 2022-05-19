package io.github.alexeymartynov.guessbrawlstars;

public enum GuessCharacter {

    LEON(R.string.character_leon, R.id.character_leon, R.id.secret_character_leon),
    SPIKE(R.string.character_spike, R.id.character_spike, R.id.secret_character_spike);

    private String name;
    private int image, secret_image;

    private GuessCharacter(String name, int image, int secret_image) {

        this.name = name;
        this.image = image;
        this.secret_image = secret_image;
    }
}
