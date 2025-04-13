package ma.enset.university.repository;

public class Productrepository extends JpaRepository <Product,Long> {
    List<Product> findByNameContains(String mc);
    List<Product> findByPriceGreaterThan(double price);
    @Query("select p from Product p where p.name like :x")
    List<Product> search(@Param("x")String mc);
    @Query("select p from Product p where p.price > :x")
    List<Product> searchByPrice(@Param("x")double price);

}
