package bridge.constants;

public enum GuideMessage {
    START_MESSAGE("다리 건너기 게임을 시작합니다."),
    LENGTH_MESSAGE("다리의 길이를 입력해주세요."),
    MOVE_MESSAGE("이동할 칸을 선택해주세요. (위: U, 아래: D)"),
    RESTART_MESSAGE("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"),
    END_MESSAGE("최종 게임 결과");

    private final String message;

    GuideMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
