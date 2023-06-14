package ru.practicum.user;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//import ru.practicum.dto.UserDto;
//import ru.practicum.entities.User;
//import ru.practicum.repositories.UserRepository;
//import ru.practicum.services.api.UserService;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class UserServiceImpl implements UserService {
//    private final UserRepository repository;
//
//    public UserServiceImpl(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    public void checkUsers(){
//        // сначала создаём описание сортировки по полю id
//        Sort sortById = Sort.by(Sort.Direction.ASC, "id");
//        // затем создаём описание первой "страницы" размером 32 элемента
//        Pageable page = PageRequest.of(0, 32, sortById);
//        do {
//            // запрашиваем у базы данных страницу с данными
//            Page<User> userPage = repository.findAll(page);
//            // результат запроса получаем с помощью метода getContent()
//            userPage.getContent().forEach(user -> {
//                // проверяем пользователей
//            });
//            // для типа Page проверяем, существует ли следующая страница
//            if(userPage.hasNext()){
//                // если следующая страница существует, создаём её описание, чтобы запросить на следующей итерации цикла
//                page = PageRequest.of(userPage.getNumber() + 1, userPage.getSize(), userPage.getSort()); // или для простоты -- userPage.nextOrLastPageable()
//            } else {
//                page = null;
//            }
//        } while (page != null);
//    }
//}