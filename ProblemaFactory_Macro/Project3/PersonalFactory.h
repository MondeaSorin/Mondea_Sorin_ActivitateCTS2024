#pragma once
#include <map>
#include <memory>
#include <string>

#include "PersonalSpital.h"

class PersonalFactory
{
public:
    typedef std::shared_ptr<PersonalSpital>(*CreateInstanceFunc)();

    static std::shared_ptr<PersonalSpital> createInstance(const std::string& name)
    {
        auto it = getRegistry().find(name);
        if (it == getRegistry().end())
            return nullptr;
        return it->second();
    }

    static void registerType(const std::string& name, CreateInstanceFunc func)
    {
        getRegistry()[name] = func;
    }

private:
    typedef std::map<std::string, CreateInstanceFunc> Registry;
    static Registry& getRegistry()
    {
        static Registry instance;
        return instance;
    }
};

#define REGISTER_TYPE(NAME, TYPE) \
    namespace { \
        std::shared_ptr<PersonalSpital> create##TYPE() { return std::make_shared<TYPE>(); } \
        const bool registered##TYPE = [](){ PersonalFactory::registerType(NAME, create##TYPE); return true; }(); \
    }