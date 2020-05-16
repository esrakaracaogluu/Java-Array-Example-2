Person sınıfını tanımlayın
 Name String
 Surname String
 Birth Year (int)
 Gender (char)

Bir Kisi arrayi yönetin.

Main metodunda 3 kişiyi ön yükleme ile
listeye ekleyin.

Silme sonucunda arrayde boşluk olursa
boşluk temizlensin, array aralıksız olsun.

Silme ve update’te hata yakalamanıza
gerek yok.

Listeleme bir defa yazılıp işlemlerden
sonra çağırılsın.

Kişi array’ini main metodunun olduğu
test programının class değişkeni olarak
tanımlayabilirsiniz.

Silmede tek kayıt silinecek
varsayabilirsiniz.

Örnek Çalışma:
Mevcut Liste :
1 – Ömer 
2 – Furkan 
3 – Bengisu 

(MENU:)
Ekle (E)
Sil (S)
Değiştir (D)
Listele (L)
Detay Görüntüle(G)
Ara (A)
Çıkış (C)

Seçim : E
Ekleme (Ad,Soyad,Cinsiyet,
DoğumYılı): Ahmet Gül E 1988
Ahmet eklendi

Mevcut Liste :
1 – Ömer 
2 – Furkan 
3 – Bengisu 
4 – Ahmet 

MENU
Seçim : S
Silinecek şahsın adı : Ömer
1 – Furkan 
2 – Bengisu 
3 – Ahmet 

MENU
Seçim : D
Değiştirilecek şahsın indeksi : 1
Şahsın Bilgileri: Furkan ,
1995, E
Yeni Bilgiler (Ad Soyad Cinsiyet
DoğumYılı):
Semir E 1995
1 – Semir 
2 – Bengisu 
3 – Ahmet 

MENU
Seçim : L
1 – Semir 

2 – Bengisu 
3 – Ahmet 

MENU
Seçim : G
Görüntülenecek şahsın indeksi : 1
Semir Kurt E 1995

MENU
Seçim : A
Arama (like %) : Öz
2 - Bengisu K 1996

MENU
Seçim : Ç
Güle güle
