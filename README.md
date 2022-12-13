# FP-OOP2022
</br>

| Nama                 | NRP        |
| -------------------- | ---------- |
| Rizky Alifiyah Rahma | 5025211208 |



### Penjelasan Singkat

Game yang ingin saya buat adalah game yang berjudul "The Inviders". Game ini memiliki konsep tentang seorang pemanah yang memiliki ambisi untuk menjadi pemanah terbaik. Nantinya, target-target yang berupa burung tersebut akan berubah menjadi poin. User dapat mengontrol pemanah tersebut ke atas, ke bawah, ke kanan, dan ke kiri agar memudahkan pemanah untuk memanah burung. Jika pemanah mengenai kotoran burung, pemanah tersebut harus mengulang stage dari awal dan poin-poin yang didapatkan akan disimpan sebagai pembanding untuk Highscore. Jika pemanah berhasil mengenai semua burung dalam stage tersebut, pemanah akan dianggap menang dan lanjut ke stage berikutnya yang lebih susah. Semakin banyak stage yang diselesaikan, semakin banyak poin yang didapatkan, dan semakin besar pula highscore yang didapatkan.</br>


===Berikut merupakan beberapa contoh dari daftar materi OOP yang terdapat di FP yang telah saya buat/modifikasi===


```
Casting/Conversion
Untuk OOP ini, saya implementasikan di dalam class Commons. Saya mengkonversikan data yang 
bertipe string menjadi data yang bertipe int. Contoh:
String chance = "5"
int CHANCE = Integer.parseInt(chance);


Constructor
Pada class Board, terdapat constructor yang berisikan method-method untuk membuat game


Overloading
Pada method act() terdapat pada class Player dan Alien dengan isi method yang berbeda.


Overriding
Pada class Board dan beberapa class lainnya yang berisikan method keyPressed() dan keyReleased()
untuk mendeteksi input dari keyboard


Encapsulation
Terdapat set dan get tipe data private di dalam class Sprite seperti setWidth() dan getWidth().

public int getWidth() {
    return width;
}

public void setWidth(int width) {
    this.width = width;
}


Inheritance
Terdapat inheritance dengan metode extend dari parent class, yaitu Sprite ke Child class seperti Aliens,
Shot, Bomb, dan Player


Polymorphism
Polymorphism yang digunakan pada FP ini adalah overloading dan overriding, peletakannya sendiri
sama seperti yang telah dituliskan di penjelasan overloading dan overriding


ArrayList
Pada class Board, terdapat ArrayList yang mengatur banyaknya aliens dalam sebuah stage


Exception Handling
Exception handling dapat ditemukan pada class TheInvaders, lebih tepatnya adalah exception handling untuk
mengatasi error pada GUI yang tidak muncul

try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) 
{ JOptionPane.showMessageDialog(null,  "The Invaders was unable to set the Cross Platform Look And Feel.\n" 
        + "The Invaders may appear differently than it was intended", 
         "Game Appearance Warning", JOptionPane.WARNING_MESSAGE);
  e.printStackTrace();
}


GUI
Pada FP ini digunakan GUI. Unsur - unsur GUI banyak digunakan dalam membentuk The Invaders, salah satunya
adalah Main Menu yang dibuat di dalam class TheInvaders


Interface
Terdapat class Commons yang merupakan interface bagi class-class yang ada di package The Invaders


Abstract Class
Tipe abstract class digunakan dalam membentuk class Sprite


Generics
Generics digunakan untuk menginput score yang terdapat di class ScoreManager


Collection
Pada unsur OOP collection, dapat ditemukan melalui adanya penggunakan ArrayList. ArrayList
sendiri digunakan pada class Board untuk melakukan input dan output score.


Input Output
Input dan output pada FP ini dapat ditemukan dalam melakukan input dan output skor pemain.
Method yang digunakan dapat ditemukan di class Board pada method animationCycle() dan paint()
```






===EXTERNAL SOURCES===

```Code Sources```
```
1. https://github.com/tatilattanzi/java-space-invaders.git)
2. https://github.com/mystor/cisc124-assn4-game
```

