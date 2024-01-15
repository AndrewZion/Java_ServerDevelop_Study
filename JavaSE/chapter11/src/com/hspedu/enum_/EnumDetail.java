package com.hspedu.enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSMUSIC.playing();
    }
}

class A {

}

//使用enum关键字后，就不能再继承其他类了，enum会隐式继承Enum，Java是单继承机制
//enum Season3 extends A {
//
//}

interface IPlaying {
    public void playing();
}
enum Music implements IPlaying {
    CLASSMUSIC;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐...");
    }
}