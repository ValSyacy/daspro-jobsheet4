# Pseudocode Modifikasi #
Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan harga barang}

Deklarasi:
harga, jumlah, halaman : int
dis, total, bayar, jmlDis : double
merek : string

Deskripsi:
print "Masukkan Merek Buku”
read merek
print " Masukkan Jumlah Halaman”
read halaman
print "Masukkan Total Diskon”
read diskon
print "Masukkan harga barang”
read harga
print "Masukkan jumlah barang”
read jumlah
total = harga *jumlah
jmlDis=total*dis
bayar=total-jmlDis
print “Diskon yang anda dapatkan adalah”
print jmlDiskon
print "Jumlah yang harus dibayar adalah”
print bayar

# Flowchart Modifikasi #
flowchart TD;
```mermaid
    A([Mulai])-->B{{int harga, jumlah, halaman. double diskon, total, bayar, jumlah. string merk}}
    B-->C[/Merek, Halaman, Diskon, Harga, Jumlah/]
    C-->D(Total:harga*jumlah, jmlh_dis:total*diskon, Bayar:total-jmlh_diskon)
    D-->E[/Total Diskon, Total Harga/]
    E-->F([Selesai])
```