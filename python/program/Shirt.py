from Clothing import Clothing

# deklarasi class

# deklarasi class menjadi anak dari Clothing


class Shirt(Clothing):

    # deklarasi private atribut
    __color = ""
    __sleeve_type = ""

    # constructor

    def __init__(self, idProduct="", nama="", brand="", price="", color="", sleeve_type="", size="", material="", gender=""):
        super().__init__(idProduct, nama, brand, price, size, material, gender)
        self.__color = color
        self.__sleeve_type = sleeve_type

    # setter dan getter
    def get_color(self):
        return self.__color

    def set_color(self, color):
        self.__color = color

    def get_sleeve_type(self):
        return self.__sleeve_type

    def set_sleeve_type(self, sleeve_type):
        self.__sleeve_type = sleeve_type
