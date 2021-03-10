class Employee:

    def __init__(self, name, department):
        self.__name = name
        self.__department = department

    def set_name(self, name):
        self.__name = name

    def set_department(self, department):
        self.__department = department

    def get_name(self):
        return self.__name

    def get_department(self):
        return self.__department
