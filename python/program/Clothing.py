from Product import Product

# deklarasi class

# deklarasi class menjadi anak dari product


class Clothing(Product):

    # deklarasi private atribut
    __size = ""
    __material = ""
    __gender = ""

    # constructor

    def __init__(self, idProduct="", nama="", brand="", price="", size="", material="", gender=""):
        super().__init__(idProduct, nama, brand, price)
        self.__size = size
        self.__material = material
        self.__gender = gender

    # setter dan getter
    def get_size(self):
        return self.__size

    def set_size(self, size):
        self.__size = size

    def get_material(self):
        return self.__material

    def set_material(self, material):
        self.__material = material

    def get_gender(self):
        return self.__gender

    def set_gender(self, gender):
        self.__gender = gender
