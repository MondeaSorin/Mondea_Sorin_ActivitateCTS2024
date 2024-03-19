#include "PersonalFactory.h"
#include "Medic.h"
#include "Brancardier.h"
#include "Asistent.h"
#include "FemeieServiciu.h"

int main() {
    std::shared_ptr<PersonalSpital> medic = PersonalFactory::createInstance("Medic");
    std::shared_ptr<PersonalSpital> brancardier = PersonalFactory::createInstance("Brancardier");
    std::shared_ptr<PersonalSpital> asistent = PersonalFactory::createInstance("Asistent");
    std::shared_ptr<PersonalSpital> femeie = PersonalFactory::createInstance("FemeieServiciu");

    medic->lucreaza();
    brancardier->lucreaza();
    asistent->lucreaza();
    femeie->lucreaza();

    return 0;
}