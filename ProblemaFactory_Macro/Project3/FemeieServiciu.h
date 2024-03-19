#pragma once
#include <iostream>

#include "PersonalFactory.h"
#include "PersonalSpital.h"

class FemeieServiciu : public PersonalSpital
{
public:
    virtual void lucreaza() override
    {
        std::cout << "Femeia de serviciu lucreaza" << std::endl;
    }
};

REGISTER_TYPE("FemeieServiciu", FemeieServiciu)