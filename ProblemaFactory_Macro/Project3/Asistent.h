#pragma once
#include <iostream>

#include "PersonalSpital.h"

class Asistent : public PersonalSpital
{
	virtual void lucreaza() override
	{
		std::cout << "Asistentul lucreaza" << std::endl;
	}
};

REGISTER_TYPE("Asistent", Asistent)