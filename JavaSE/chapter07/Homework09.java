/**
 * Homework09
 * 9.定义Music类，里面有音乐名name、音乐时长times属性，
 * 并有播放play功能和找回本身属性信息的功能方法getlnfo.
 *  Homework09.java
 */
public class Homework09 {
    public static void main(String[] args) {
        Music music = new Music("后来的我们", 280);
        music.play();
        music.getInfo();
    } 
}

class Music {
    private String name;
    private int times;
    public Music() {}
    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }
    public void play() {
        System.out.println(this.name + "正在播放，时长" + this.times + "秒");
    }
    public void getInfo() {
        System.out.println(this.name + " " + this.times);
    }
}