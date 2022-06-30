package hiber.service;

import hiber.model.User;
import java.util.List;

public interface CarService {
    List<User> getUserByCar(String model, int series);
}
