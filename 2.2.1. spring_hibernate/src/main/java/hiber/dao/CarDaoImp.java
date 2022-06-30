package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("uncheked")
    public List<User> getUserByCar(String model, int series) {
        String HQL = "from User where car.model = :model and car.series = :series";
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(HQL)
                .setParameter("model", model)
                .setParameter("series", series);
        return query.getResultList();
    }
}
