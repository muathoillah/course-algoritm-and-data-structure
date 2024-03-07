public class ArrayBlocks {
    public static void main(String[] args) {
        Blocks[] blarray =new Blocks[3];

        blarray[0]=new Blocks(100, 12, 12);
        blarray[1]=new Blocks(120, 80, 180);
        blarray[2]=new Blocks(140, 50, 50);

    for (int i=0;i<3;i++){
        System.out.println("volume blocks"+ i+":"+blarray[i].countVolume());
    }
    }
}
