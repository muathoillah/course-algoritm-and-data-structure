
    public class Dragon {
        private int x;
        private int y;
        private int width;
        private int height;
    
        public Dragon(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    
        public void moveLeft() {
            if (x > 0) {
                x--;
            } else {
                detectCollision();
            }
        }
    
        public void moveRight() {
            if (x < width) {
                x++;
            } else {
                detectCollision();
            }
        }
    
        public void moveUp() {
            if (y > 0) {
                y--;
            } else {
                detectCollision();
            }
        }
    
        public void moveDown() {
            if (y < height) {
                y++;
            } else {
                detectCollision();
            }
        }
    
        public void printPosition() {
            System.out.println("Position: (" + x + ", " + y + ")");
        }
    
        private void detectCollision() {
            System.out.println("Game Over");
        }
    
        public static void main(String[] args) {
            int width = 10; // lebar area permainan
            int height = 10; // tinggi area permainan
    
            Dragon dragon = new Dragon(0, 0, width, height);
    
            // Tes gerakan
            dragon.moveRight(); // Pindah ke kanan
            dragon.printPosition(); // Cetak posisi
            dragon.moveDown(); // Pindah ke bawah
            dragon.printPosition(); // Cetak posisi
            dragon.moveDown(); // Pindah ke bawah lagi (menyentuh ujung)
        }
    }
    
