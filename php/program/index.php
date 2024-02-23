<?php
// import file
require ('Shirt.php');

// membuat list of objek Shirt
$arrayshr = array();
// Intansiasi objek shirt 1
$shr1 = new Shirt();
// inisialisasi shirt 1 menggunakan method setter
$shr1->set_idProduct("12345B");
$shr1->set_nama("Bajuu");
$shr1->set_brand('Sajoo');
$shr1->set_price("Rp.1.000.000,-");
$shr1->set_color("Blue");
$shr1->set_sleeve_type("Kimono");
$shr1->set_size("XL");
$shr1->set_material("Satin");
$shr1->set_gender("Perempuan");
$shr1->set_foto('foto/1.png');
array_push($arrayshr, $shr1);

// Intansiasi objek shirt 2
$shr2 = new Shirt();
// inisialisasi shirt 2 menggunakan method setter
$shr2->set_idProduct("23456C");
$shr2->set_nama("Azaa");
$shr2->set_brand('Sajoo');
$shr2->set_price("Rp.980.000,-");
$shr2->set_color("Black");
$shr2->set_sleeve_type("Lurus");
$shr2->set_size("XL");
$shr2->set_material("Katun");
$shr2->set_gender("Laki-Laki");
$shr2->set_foto('foto/2.jpg');
array_push($arrayshr, $shr2);

// Intansiasi objek shirt 3
$shr3 = new Shirt();
// inisialisasi shirt 3 menggunakan method setter
$shr3->set_idProduct("23456C");
$shr3->set_nama("Azaa Blush");
$shr3->set_brand('Sajoo');
$shr3->set_price("Rp.900.000,-");
$shr3->set_color("White");
$shr3->set_sleeve_type("Lurus");
$shr3->set_size("L");
$shr3->set_material("Katun");
$shr3->set_gender("Perempuan");
$shr3->set_foto('foto/3.jpg');
array_push($arrayshr, $shr3);


// menampilkan isi list of objek shirt dalam bentuk tabel 
echo '<center>SELAMAT DATANG<br><br>';
echo '<center>List Product<br><br>';
// judul kolom tabel
echo "<center><table border='3'>";
        echo "<tr>
            <th> ID Product </th>
            <th> Nama </th>
            <th> Brand </th>
            <th> Price </th>
            <th> Color </th>
            <th> Sleeve Type </th>
            <th> Size </th>
            <th> Material </th>
            <th> Gender </th>
            <th> Foto </th>
            </tr>";
// isi kolom tabel
for ($i=0; $i < count($arrayshr); $i++)
{
echo "<tr><td>";
                echo $arrayshr[$i]->get_idProduct();
                echo "</td><td>";
                echo $arrayshr[$i]->get_nama();
                echo "</td><td>";
                echo $arrayshr[$i]->get_brand();
                echo "</td><td>";
                echo $arrayshr[$i]->get_price();
                echo "</td><td>";
                echo $arrayshr[$i]->get_color();
                echo "</td><td>";
                echo $arrayshr[$i]->get_sleeve_type();
                echo "</td><td>";
                echo $arrayshr[$i]->get_size();
                echo "</td><td>";
                echo $arrayshr[$i]->get_material();
                echo "</td><td>";
                echo $arrayshr[$i]->get_gender();
                echo "</td><td>";
                echo "<img src='" . $arrayshr[$i]->get_foto(). "'style='width: 150px'>";
                echo "</td>";
                echo "</tr>";
    }
echo "</table> </center>";
        
?>