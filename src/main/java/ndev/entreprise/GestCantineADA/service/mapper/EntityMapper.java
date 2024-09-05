package ndev.entreprise.GestCantineADA.service.mapper;

public interface EntityMapper <D , E>{
    public E toEntity(D d);
    public D toDto(E e);
}
