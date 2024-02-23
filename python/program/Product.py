class Product:

    # deklarasi private atribut
    __idProduct = ""
    __nama = ""
    __brand = ""
    __price = ""

    # constructor
    def __init__(self, idProduct="", nama="", brand="", price=""):
        self.__idProduct = idProduct
        self.__nama = nama
        self.__brand = brand
        self.__price = price

    # setter dan getter
    def get_idProduct(self):
        return self.__idProduct

    def set_idProduct(self, idProduct):
        self.__idProduct = idProduct

    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_brand(self):
        return self.__brand

    def set_brand(self, brand):
        self.__brand = brand

    def get_price(self):
        return self.__price

    def set_price(self, price):
        self.__price = price
