public class player implements PokemonCardGame{
    Scanner inputScanner = new Scanner(System.in);
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    private ArrayList<Card> discard;
    private ArrayList<Card> prizePile;
    private String name;
    private Pokemon active = new Pokemon();
    private ArrayList<Pokemon> bench;
    int turn = 1;
    public player(){
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        discard = new ArrayList<>();
    }
    public player(int numPokemon){
        this();

        for (int i = 0; i < numPokemon; i++) {
            deck.add(new Pokemon());
        }

        int deckSize = 60;
        for (int i = 1; i < deckSize - numPokemon; i++) {
            deck.add(new Energy());
        }
    }
    
    public player(int numBulbs,int numPikas,int numCharizards, int numProfResearch, int numPokemonCollector, int numFlareGrunt, String nameInput, int numEnergy){
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        discard = new ArrayList<>();
        bench = new ArrayList<>();
        active = new Pokemon();
        name = nameInput;
        prizePile = new ArrayList<>();
        for (int i = 0; i < numBulbs; i++) {
            deck.add(new bulbasaur()); 
        }
        for (int i = 0; i < numPikas; i++) {
            deck.add(new pikachu());
        }
        for (int i = 0; i < numCharizards; i++) {
            deck.add(new charizard());
        }
        for (int i = 0; i < numProfResearch; i++) {
            deck.add(new professorResearch()); 
        }
        for (int i = 0; i < numPokemonCollector; i++) {
            deck.add(new pokemonCollector()); 
        }
        for (int i = 0; i < numFlareGrunt; i++) {
            deck.add(new flareGrunt());
        }
        for (int i = 0; i < numEnergy; i++) {
            deck.add(new Energy());
        }

        drawHand();
    }

}