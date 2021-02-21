package kz.danke.patterns.creation.factory.abstr;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMib);
}
