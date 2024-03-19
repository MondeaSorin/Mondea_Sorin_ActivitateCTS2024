#pragma once
#include <iostream>

#include "PersonalFactory.h"
#include "PersonalSpital.h"

class Brancardier : public PersonalSpital
{
public:
	virtual void lucreaza() override
	{
		std::cout << "Brancardierul lucreaza" << std::endl;
	}
};

REGISTER_TYPE("Brancardier", Brancardier);

