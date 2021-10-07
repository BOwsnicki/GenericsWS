//============================================================================
// Name        : Template4.cpp
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
	void bark() {
		cout << "Woof!" << endl;
	}
    virtual ~Dog() {}
};


template<typename T>
class Wrapper {
public:
	Wrapper(T* data) :
		data_(data) {
	}
	~Wrapper() {

	}
	void doIt() {
		data_->bark();
	}
private:
	T* data_;
};

int main() {
	Pet *p = new Pet();
	Cat *c = new Cat();
	Dog *d = new Dog();

	Wrapper<Dog*>(d) wp1;
	wp1.doIt();
}

