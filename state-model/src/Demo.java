public class Demo {
    public static void main(String[] args) {
        // 状态模式
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
