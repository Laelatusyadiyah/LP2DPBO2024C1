<?php
// import file
require ('Clothing.php');

// deklarasi kelas Shirt yang merupakan anak dari Clothing
class Shirt extends Clothing {
    // atribut private
    private $color = '';
    private $sleeve_type = '';
    private $foto = '';

    // construktor
    public function __construct( $color = '', $sleeve_type = '', $foto = '' ) {
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
        $this->foto = $foto;
    }
    // getter dan setter
    public function get_color(){
        return $this->color;
    }
    public function set_color($color){
        $this->color = $color;
    }
    
    public function get_sleeve_type(){
        return $this->sleeve_type;
    }
    public function set_sleeve_type($sleeve_type){
        $this->sleeve_type = $sleeve_type;
    }

    public function get_foto(){
        return $this->foto;
    }
    public function set_foto($foto){
        $this->foto = $foto;
    }
}

?>