<?php

// deklarasi kelas Product
class Product {
    // atribut private
    private $idProduct = '';
    private $nama = '';
    private $brand = '';
    private $price = '';

    // construktor
    public function __construct( $idProduct = '', $nama = '', $brand = '', $price='' ) {
        $this->idProduct = $idProduct;
        $this->nama = $nama;
        $this->brand = $brand;
        $this->price = $price;
    }
    // getter dan setter
    public function get_idProduct(){
        return $this->idProduct;
    }
    public function set_idProduct($idProduct){
        $this->idProduct = $idProduct;
    }

    public function get_nama(){
        return $this->nama;
    }
    public function set_nama($nama){
        $this->nama = $nama;
    }

    public function get_brand(){
        return $this->brand;
    }
    public function set_brand($brand){
        $this->brand = $brand;
    }

    public function get_price(){
        return $this->price;
    }
    public function set_price($price){
        $this->price = $price;
    }
}

?>