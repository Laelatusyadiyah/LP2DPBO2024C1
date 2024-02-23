<?php

// import file
require ('Product.php');

// deklarasi kelas Clothing
class Clothing extends Product {
    // atribut private
    private $size = '';
    private $material = '';
    private $gender = '';

    // construktor
    public function __construct( $size = '', $material = '' , $gender = '') {
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }
    // getter dan setter 
    public function get_size(){
        return $this->size;
    }
    public function set_size($size){
        $this->size = $size;
    }

    public function get_material(){
        return $this->material;
    }
    public function set_material($material){
        $this->material = $material;
    }
    
    
    public function get_gender(){
        return $this->gender;
    }
    public function set_gender($gender){
        $this->gender = $gender;
    }
}

?>