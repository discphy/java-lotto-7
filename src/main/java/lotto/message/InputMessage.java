package lotto.message;

public enum InputMessage implements Message {

    INPUT_PURCHASE_MONEY("구입금액을 입력해 주세요."),
    INPUT_JACKPOT_LOTTO("\n당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("\n보너스 번호를 입력해 주세요."),
    ;

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}