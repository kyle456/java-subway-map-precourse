package subway;

import subway.view.menu.MainMenu;

public class Application {
    public static void main(String[] args) {
        InitialSetting.setInitialSubwayInfo();
        MainMenu.print();
    }
}
