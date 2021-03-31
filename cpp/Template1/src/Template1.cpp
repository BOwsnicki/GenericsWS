//============================================================================
// Name        : Template1.cpp
// Author      : 
// Version     :
// Copyright   : Grab it and run!
// Description : Simple Template example
//============================================================================

#include <iostream>
#include <assert.h>

using namespace std;

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
	Array<int> ai;
	Array<float> af;
	Array<char*> ac;
	Array<std::string> as;
	Array<Array<int>> aai;
}

