//============================================================================
// Name        : Template3.cpp
// Author      : Bernd OK
// Version     :
// Copyright   : Just grab it and run!
// Description : Templates with(out) pointers
//============================================================================

#include <iostream>
#include <assert.h>

using namespace std;

class Pet {
public:
	virtual void speak() {
		cout << "I'm a Pet" << endl;
	}
    virtual ~Pet() {}
};

class Cat: public Pet {
public:
	virtual void speak() {
		cout << "I'm a Cat" << endl;
	}
    virtual ~Cat() {}
};


class Dog: public Pet {
public:
	virtual void speak() {
		cout << "I'm a Dog" << endl;
	}
    virtual ~Dog() {}
};


template<typename T>
class Array {
public:
	Array(int len = 10) :
		len_(len), data_(new T[len]) {
	}
	~Array() {
		delete[] data_;
	}
	int len() const {
		return len_;
	}
	const T& operator[](int i) const {
		return data_[check(i)];
	}
	T& operator[](int i) {
		return data_[check(i)];
	}
	Array(const Array<T>&);
	Array(Array<T>&&);
	Array<T>& operator=(const Array<T>&);
	Array<T>& operator=(Array<T>&&);
private:
	int len_;
	T *data_;
	int check(int i) const {
		// assert(i >= 0 && i < len_);
		return i;
	}
};

int main() {
	Pet *p = new Pet();
	Cat *c = new Cat();

	Array<Pet> ap;
	ap[0] = *p;
	ap[1] = *c;
	ap[0].speak();
	ap[1].speak();
	cout << endl;

	Array<Pet*> app;
	app[0] = p;
	app[1] = c;
	app[0]->speak();
	app[1]->speak();
	cout << endl;

	Array<Pet>* app1 = new Array<Pet>;
	(*app1)[0] = *p;
	(*app1)[1] = *c;
	(*app1)[0].speak();
	(*app1)[1].speak();
	cout << endl;

	Array<Pet*>* app2 = new Array<Pet*>;
	(*app2)[0] = p;
	(*app2)[1] = c;
	(*app2)[0]->speak();
	(*app2)[1]->speak();
}

