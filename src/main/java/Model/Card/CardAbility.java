package Model.Card;

public abstract class CardAbility {
    private Card card;

    public CardAbility(Card card) {
        this.card = card;
    }

    abstract public void applyAbility();

    public Card getCard() {
        return card;
    }
}
