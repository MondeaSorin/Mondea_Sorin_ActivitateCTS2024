#pragma once
#include <iostream>

#include "PersonalSpital.h"

class Medic : public PersonalSpital
{
public:
	virtual void lucreaza() override
	{
		std::cout << "Medicul lucreaza" << std::endl;
	}
};

REGISTER_TYPE("Medic", Medic)

