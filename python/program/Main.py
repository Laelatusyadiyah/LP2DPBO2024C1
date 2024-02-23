# import class dari file
from Shirt import Shirt

# deklrasi variabel
i = 0
isFound = False

# deklarasi array
shirt = []
# looping while dengan syarat masukkan user bukan 5 yang berarti exit dari program
# looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5 query yaitu create, read, update dan exit
# untuk menentukan query yang sesuai dengan yang diminta user saya menggunakan fungsi if else (untuk python) yang sesuai dengan menu,
# 1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk exit
while i != 5:

    # menampilkan menu

    print("")
    print("Program Informasi Product")
    print("1. Create")
    print("2. Read")
    print("3. Update")
    print("4. Delete")
    print("5. Exit")
    print("Masukkan Query yang diinginkan:")

    # meminta masukkan query berapa yang diinginkan user
    i = int(input())
    print("")

    #  if else untuk menentukan query yang diinginkan user

    # input 1 untuk create
    if i == 1:

        #  meminta masukkan user untuk menambahkan data baru
        print("ID Product   : ")
        idProduct = str(input())
        print("Nama Product : ")
        nama = str(input())
        print("Brand        : ")
        brand = str(input())
        print("Price        : ")
        price = str(input())
        print("Color        : ")
        color = str(input())
        print("Sleeve Type  : ")
        sleeve_type = str(input())
        print("Size         : ")
        size = str(input())
        print("Material     : ")
        material = str(input())
        print("Gender       : ")
        gender = str(input())
        #  objek dimasukkan ke dalam array

        shirt.append(Shirt(idProduct, nama, brand, price, color, sleeve_type, size, material, gender))
        print("DATA BARU BERHASIL DITAMBAHKAN!")

    # input 2 untuk read

    elif i == 2:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not shirt:
            print("DATA BAJU KOSONG!")
        else:
            #  menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut

            n = 1
            for Shr in shirt:
                print("Data Lengkap Product: ")
                print(n, end=". ")
                print("ID Product    :", Shr.get_idProduct())
                print("   Nama Product  :", Shr.get_nama())
                print("   Brand         :", Shr.get_brand())
                print("   Price         :", Shr.get_price())
                print("   Color         :", Shr.get_color())
                print("   Sleeve Type   :", Shr.get_sleeve_type())
                print("   Size          :", Shr.get_size())
                print("   Material      :", Shr.get_material())
                print("   Gender        :", Shr.get_gender())
                n += 1

    # input 3 untuk update
    elif i == 3:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not shirt:
            print("DATA PRODUCT KOSONG!")
        else:
            #  meminta masukkan user untuk id yang akan dicari dan akan di-update
            print("Masukkan ID Product yang akan di-Update: ")
            cari = str(input())

            #  looping untuk mencari id yang diminta oleh user
            #  jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
            for Shr in shirt:
                if cari == Shr.get_idProduct():
                    print("ID Product   : ")
                    idProduct = str(input())
                    print("Nama Product : ")
                    nama = str(input())
                    print("Brand        : ")
                    brand = str(input())
                    print("Price        : ")
                    price = str(input())
                    print("Color        : ")
                    color = str(input())
                    print("Sleeve Type  : ")
                    sleeve_type = str(input())
                    print("Size         : ")
                    size = str(input())
                    print("Material     : ")
                    material = str(input())
                    print("Gender       : ")
                    gender = str(input())

                    Shr.set_idProduct(idProduct)
                    Shr.set_nama(nama)
                    Shr.set_brand(brand)
                    Shr.set_price(price)
                    Shr.set_color(color)
                    Shr.set_sleeve_type(sleeve_type)
                    Shr.set_size(size)
                    Shr.set_material(material)
                    Shr.set_gender(gender)

                    #  isFound berubah karena id berhasil ditemukan
                    isFound = True

            #  jika id ditemukan dan jika tidak ditemukan
            if isFound == True:
                print("DATA BERHASIL DI-UPDATE!")
            else:
                print("DATA TIDAK DAPAT DITEMUKAN!")

    # input 4 untuk delete
    elif i == 4:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not shirt:
            print("DATA PRODUCT KOSONG!")
        else:
            #  meminta masukkan usuer untuk id yang akan dicari dan akan di-delete
            print("Masukkan ID Product yang akan di-Delete: ")
            cari = str(input())
            n = 0
            #  looping untuk mencari id yang diminta oleh user
            #  jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
            for Shr in shirt:

                if cari == Shr.get_idProduct():
                    shirt.pop(n)
                    #  isFound berubah karen id berhasil ditemukan
                    isFound = True
                n += 1

            #  jika id ditemukan dan jika tidak ditemukan
            if isFound == True:
                print("DATA BERHASIL DI-DELETE!")
            else:
                print("DATA TIDAK DAPAT DITEMUKAN!")
    else:
        print("TERIMA KASIH!")
