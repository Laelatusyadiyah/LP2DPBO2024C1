
// import library
import java.util.ArrayList;
import java.util.Scanner;

//deklarasi class main
class Main {
    public static void main(String[] args) {

        // deklrasi variabel
        int i, n = 0;
        String idProduct, nama, brand, price;
        String color, sleeve_type;
        String size, material;
        String gender;

        // deklrasi list menggunakan library
        ArrayList<Product> list = new ArrayList<>();

        try (// deklarasi scanner untuk input
                Scanner sc = new Scanner(System.in)) {
            /*
             * - looping while dengan syarat masukkan user bukan 5 yang berarti exit dari
             * program
             * - looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5
             * - query yaitu create, read, update dan exit
             * - untuk menentukan query yang sesuai dengan yang diminta user saya
             * menggunakan
             * switch yang sesuai dengan menu,
             * 1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk
             * exit
             */
            while (n != 5) {

                // menampilkan menu
                System.out.println("Program Informasi Product Fashion");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Masukkan Query yang diinginkan: ");

                // meminta masukkan query berapa yang diinginkan user
                n = sc.nextInt();
                sc.nextLine();

                // switch untuk menentukan query yang diinginkan user
                switch (n) {
                    // case 1 untuk create
                    case 1:

                        // meminta masukkan user untuk menambahkan data baru
                        System.out.print("ID Product    : ");
                        idProduct = sc.nextLine();
                        System.out.print("Nama Product  : ");
                        nama = sc.nextLine();
                        System.out.print("Brand         : ");
                        brand = sc.nextLine();
                        System.out.print("Price         : ");
                        price = sc.nextLine();
                        System.out.print("Color         : ");
                        color = sc.nextLine();
                        System.out.print("Sleeve Type   : ");
                        sleeve_type = sc.nextLine();
                        System.out.print("Size          : ");
                        size = sc.nextLine();
                        System.out.print("Material      : ");
                        material = sc.nextLine();
                        System.out.print("Gender        : ");
                        gender = sc.nextLine();

                        // instansiasi object tanpa parameter
                        Product temp = new Product();

                        // inputan user dimasukkan ke dalam temp dulu menggunakan setter masing-masing
                        // attribut
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
                        list.add(temp);

                        System.out.println("");
                        System.out.println("DATA BARU BERHASIL DITAMBAHKAN!");

                        break;
                    // case 2 untuk read
                    case 2:

                        // deklarasi boolean untuk mengetahui kosong atau tidak list
                        boolean isEmpty = list.isEmpty();
                        // cek terlebih dahulu apakah list kosong atau tidak
                        if (isEmpty == true) {
                            System.out.println("DATA PRODUCT KOSONG!");

                        } else {
                            // menampilkan isi dari list dengan looping for dan setiap attributnya
                            // ditampilkan dengan memanggil getter masing-masing attribut
                            for (i = 0; i < list.size(); i++) {
                                System.out.println(Integer.toString(i + 1) + ". " + "ID Product     : "
                                        + list.get(i).get_idProduct());
                                System.out.println("   Nama         : " + list.get(i).get_nama());
                                System.out.println("   Brand        : " + list.get(i).get_brand());
                                System.out.println("   Price        : " + list.get(i).get_price());
                                System.out.println("   Color        : " + list.get(i).get_color());
                                System.out.println("   Sleeve Type  : " + list.get(i).get_sleeve_type());
                                System.out.println("   Size         : " + list.get(i).get_size());
                                System.out.println("   Material     : " + list.get(i).get_material());
                                System.out.println("   Gender       : " + list.get(i).get_gender());
                                System.out.println("");
                            }
                        }
                        break;

                    case 3:
                        // deklarasi boolean untuk mengetahui kosong atau tidak list
                        isEmpty = list.isEmpty();
                        // deklarasi boolean untuk mengetahui sudah ketemu atau belum ID
                        boolean isFound = false;

                        // cek terlebih dahulu apakah list kosong atau tidak
                        if (isEmpty == true) {
                            System.out.println("DATA PRODUCT KOSONG!");
                        } else {
                            String cari;
                            System.out.print("Masukkan ID Product yang akan di-Update: ");

                            // meminta masukkan usuer untuk id yang akan dicari dan akan di-update
                            cari = sc.nextLine();

                            // looping untuk mencari id yang diminta oleh user
                            // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan
                            // diubah
                            for (i = 0; i < list.size(); i++) {
                                if (cari.compareTo(list.get(i).get_idProduct()) == 0) {

                                    System.out.print("ID Product    : ");
                                    idProduct = sc.nextLine();
                                    System.out.print("Nama Product  : ");
                                    nama = sc.nextLine();
                                    System.out.print("Brand         : ");
                                    brand = sc.nextLine();
                                    System.out.print("Price         : ");
                                    price = sc.nextLine();
                                    System.out.print("Color         : ");
                                    color = sc.nextLine();
                                    System.out.print("Sleeve Type   : ");
                                    sleeve_type = sc.nextLine();
                                    System.out.print("Size          : ");
                                    size = sc.nextLine();
                                    System.out.print("Material      : ");
                                    material = sc.nextLine();
                                    System.out.print("Gender        : ");
                                    gender = sc.nextLine();

                                    temp = new Product();
                                    temp.set_idProduct(idProduct);
                                    temp.set_nama(nama);
                                    temp.set_brand(brand);
                                    temp.set_price(price);
                                    temp.set_color(color);
                                    temp.set_sleeve_type(sleeve_type);
                                    temp.set_size(size);
                                    temp.set_material(material);
                                    temp.set_gender(gender);
                                    list.set(i, temp);

                                    // isFound berubah karena id berhasil ditemukan
                                    isFound = true;
                                }
                            }
                        }

                        // jika id ditemukan dan jika tidak ditemukan
                        if (isFound == true) {
                            System.out.println("DATA BERHASIL DI-UPDATE!");
                        } else {
                            System.out.println("DATA TIDAK DAPAT DITEMUKAN!");
                        }
                        break;

                    case 4:
                        isEmpty = list.isEmpty();
                        isFound = false;
                        String cari;

                        // cek terlebih dahulu apakah list kosong atau tidak
                        if (isEmpty == true) {
                            System.out.println("DATA PRODUCT KOSONG!");
                        } else {

                            // meminta masukkan usuer untuk id yang akan dicari dan akan di-delete
                            System.out.print("Masukkan ID Product yang akan di-Delete: ");
                            cari = sc.nextLine();

                            // looping untuk mencari id yang diminta oleh user
                            // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan
                            // dihapus
                            for (i = 0; i < list.size(); i++) {
                                if (cari.compareTo(list.get(i).get_idProduct()) == 0) {
                                    list.remove(i);
                                    // isFound berubah karena id berhasil ditemukan
                                    isFound = true;
                                }
                            }
                        }

                        // jika id ditemukan dan jika tidak ditemukan
                        if (isFound == true) {
                            System.out.println("DATA BERHASIL DI-DELETE!");
                        } else {
                            System.out.println("DATA TIDAK DAPAT DITEMUKAN!");
                        }
                        break;
                    default:
                        System.out.println("TERIMA KASIH!");

                        break;
                }
            }
        }
    }
}
