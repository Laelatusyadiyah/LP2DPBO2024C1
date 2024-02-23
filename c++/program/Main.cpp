// import library dan file
#include <bits/stdc++.h>
#include <list>
#include "Shirt.cpp"

int main()
{
    cout << '\n'
         << "~~~ SELAMAT DATANG ~~~" << '\n';
    // deklrasi variabel
    int i, n = 0;
    string idProduct, nama, brand, price, color, sleeve_type, size, material, gender, cari;

    // deklrasi list menggunakan library
    list<Shirt> lList;

    /* membuat perulangan while untuk menjalankan setiap menu yang tersedia dengan menggunakan switch untuk menentukan menu yang dipilih */
    while (n != 5)
    {
        // instansiasi object tanpa parameter
        Shirt temp;

        // menampilkan menu
        cout << '\n'
             << "Program Informasi Product" << '\n';
        cout << "1. Create" << '\n';
        cout << "2. Read" << '\n';
        cout << "3. Update" << '\n';
        cout << "4. Delete" << '\n';
        cout << "5. Exit" << '\n';
        cout << "Masukkan Query yang diinginkan: ";

        // meminta masukkan query berapa yang diinginkan user
        cin >> n;
        cout << '\n';

        // switch untuk menentukan query yang diinginkan user
        switch (n)
        {
            // case 1 untuk create
        case 1:
            int x;
            cout << "Berapa daftar yang ingin dimasukkan : ";
            cin >> x;
            for (int i = 0; i < x; i++)
            {
                // meminta masukkan user untuk menambahkan data baru sesuai jumlah yang diinginkan
                cout << "\nID Product     : ";
                cin >> idProduct;
                cout << "Nama Product   : ";
                cin >> nama;
                cout << "Brand          : ";
                cin >> brand;
                cout << "Price          : ";
                cin >> price;
                cout << "Color          : ";
                cin >> color;
                cout << "Sleeve Type    : ";
                cin >> sleeve_type;
                cout << "Size           : ";
                cin >> size;
                cout << "Material       : ";
                cin >> material;
                cout << "Gender         : ";
                cin >> gender;

                // inputan user dimasukkan ke dalam temp dulu menggunakan setter masing-masing attribut
                temp.set_idProduct(idProduct);
                temp.set_nama(nama);
                temp.set_brand(brand);
                temp.set_price(price);
                temp.set_color(color);
                temp.set_sleeve_type(sleeve_type);
                temp.set_size(size);
                temp.set_material(material);
                temp.set_gender(gender);

                // objek dimasukkan ke dalam list
                lList.push_back(temp);
            }

            cout << "DATA BARU BERHASIL DITAMBAHKAN!" << '\n';
            break;
            // case 2 untuk read
        case 2:

            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA PRODUCT KOSONG!" << '\n';
            }
            else
            {
                // menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut
                i = 0;
                cout << "Data Lengkap PRODUCT: ";

                for (list<Shirt>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    cout << '\n'
                         << (i + 1) << '.' << " ID            : " << it->get_idProduct() << '\n';
                    cout << "   Nama        : " << it->get_nama() << '\n';
                    cout << "   Brand       : " << it->get_brand() << '\n';
                    cout << "   Price       : " << it->get_price() << "\n";
                    cout << "   Color       : " << it->get_color() << "\n";
                    cout << "   Sleeve Type : " << it->get_sleeve_type() << "\n";
                    cout << "   Size        : " << it->get_size() << "\n";
                    cout << "   Material    : " << it->get_material() << "\n";
                    cout << "   Gender      : " << it->get_gender() << "\n";
                    i++;
                }
            }
            break;
            // case 3 untuk update
        case 3:
            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA PRODUCT KOSONG!" << '\n';
            }
            else
            {
                // deklarasi boolean untuk menentukan apakah data ditemukan atau tidak
                bool isFound = false;
                // meminta masukkan usuer untuk id yang akan dicari dan akan di-update
                cout << "Masukkan ID Product yang akan di-Update: ";
                cin >> cari;

                // looping untuk mencari id yang diminta oleh user
                // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
                for (list<Shirt>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    if (cari == it->get_idProduct())
                    {
                        cout << "\nID Product   : ";
                        cin >> idProduct;
                        cout << "Nama Product   : ";
                        cin >> nama;
                        cout << "Brand          : ";
                        cin >> brand;
                        cout << "Price          : ";
                        cin >> price;
                        cout << "Color          : ";
                        cin >> color;
                        cout << "Sleeve Type    : ";
                        cin >> sleeve_type;
                        cout << "Size           : ";
                        cin >> size;
                        cout << "Material       : ";
                        cin >> material;
                        cout << "Gender         : ";
                        cin >> gender;

                        it->set_idProduct(idProduct);
                        it->set_nama(nama);
                        it->set_brand(brand);
                        it->set_price(price);
                        it->set_color(color);
                        it->set_sleeve_type(sleeve_type);
                        it->set_size(size);
                        it->set_material(material);
                        it->set_gender(gender);
                        // isFound berubah karena id berhasil ditemukan
                        isFound = true;
                    }
                }
                // jika id ditemukan dan jika tidak ditemukan
                if (isFound == true)
                {
                    cout << "DATA BERHASIL DI-UPDATE!" << '\n';
                }
                else
                {
                    cout << "DATA TIDAK DAPAT DITEMUKAN!" << '\n';
                }
            }
            break;
        case 4:

            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA PRODUCT KOSONG!" << '\n';
            }
            else
            {
                // deklarasi boolean untuk menentukan apakah data ditemukan atau tidak
                bool isFound = false;
                cout << "Masukkan ID product yang akan di-Delete: ";
                // meminta masukkan usuer untuk id yang akan dicari dan akan di-delete
                cin >> cari;

                // looping untuk mencari id yang diminta oleh user
                // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
                for (list<Shirt>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    if (cari == it->get_idProduct())
                    {
                        it = lList.erase(it);
                        // isFound berubah karena id berhasil ditemukan
                        isFound = true;
                    }
                }
                // jika id ditemukan dan jika tidak ditemukan
                if (isFound == true)
                {
                    cout << "DATA BERHASIL DI-DELETE!" << '\n';
                }
                else
                {
                    cout << "DATA TIDAK DAPAT DITEMUKAN!" << '\n';
                }
            }
            break;
        default:
            cout << "TERIMA KASIH!" << '\n';

            break;
        }
    }

    return 0;
}