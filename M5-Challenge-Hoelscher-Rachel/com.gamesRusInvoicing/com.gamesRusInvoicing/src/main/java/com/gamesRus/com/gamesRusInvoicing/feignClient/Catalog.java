package com.gamesRus.com.gamesRusInvoicing.feignClient;

import com.gamesRus.com.gamesRusInvoicing.viewModel.ConsoleViewModel;
import com.gamesRus.com.gamesRusInvoicing.viewModel.GameViewModel;
import com.gamesRus.com.gamesRusInvoicing.viewModel.TShirtViewModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "gamestore-catalog")
public interface Catalog {

    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public List<ConsoleViewModel> getAllConsoles();

    @RequestMapping(value = "/console/{id}", method = RequestMethod.GET)
    public ConsoleViewModel getConsoleById(@PathVariable("id") long consoleId);

    @RequestMapping(value = "/console", method = RequestMethod.POST)
    public ConsoleViewModel createConsole(ConsoleViewModel consoleViewModel);

    @RequestMapping(value = "/console", method = RequestMethod.PUT)
    public ConsoleViewModel updateConsole(ConsoleViewModel consoleViewModel);

    @RequestMapping(value = "/console/{id}", method = RequestMethod.DELETE)
    public ConsoleViewModel deleteConsole(@PathVariable("id") long consoleId);

    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public List<GameViewModel> getAllGames();

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public GameViewModel getGameById(@PathVariable("id") long gameId);

    @RequestMapping(value = "/game", method = RequestMethod.POST)
    public GameViewModel createGame(GameViewModel gameViewModel);

    @RequestMapping(value = "/game", method = RequestMethod.PUT)
    public GameViewModel updateGame(GameViewModel gameViewModel);

    @RequestMapping(value = "/game/{id}", method = RequestMethod.DELETE)
    public GameViewModel deleteGame(@PathVariable("id") long gameId);

    @RequestMapping(value = "/tshirt", method = RequestMethod.GET)
    public List<TShirtViewModel> getAllTShirts();

    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.GET)
    public TShirtViewModel getTShirtById(@PathVariable("id") long tShirtId);

    @RequestMapping(value = "/tshirt", method = RequestMethod.POST)
    public TShirtViewModel createTShirt(TShirtViewModel tShirtViewModel);

    @RequestMapping(value = "/tshirt", method = RequestMethod.PUT)
    public TShirtViewModel updateTShirt(TShirtViewModel tShirtViewModel);

    @RequestMapping(value = "/tshirt/{id}", method = RequestMethod.DELETE)
    public TShirtViewModel deleteTShirt(@PathVariable("id") long tShirtId);

//
//    @RestController
//    @RequestMapping(value = "/console")
//    @CrossOrigin(origins = {"http://localhost:3000"})
//    public class ConsoleController {
//
//        @Autowired
//        GameStoreServiceLayer service;
//
//        @PostMapping
//        @ResponseStatus(HttpStatus.CREATED)
//        public ConsoleViewModel createConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel) {
//            consoleViewModel = service.createConsole(consoleViewModel);
//            return consoleViewModel;
//        }
//
//        @GetMapping("/{id}")
//        @ResponseStatus(HttpStatus.OK)
//        public ConsoleViewModel getConsole(@PathVariable("id") long consoleId) {
//            ConsoleViewModel consoleViewModel = service.getConsoleById(consoleId);
//            if (consoleViewModel == null) {
//                throw new IllegalArgumentException("Console could not be retrieved for id " + consoleId);
//            } else {
//                return consoleViewModel;
//            }
//        }
//
//        @PutMapping
//        @ResponseStatus(HttpStatus.NO_CONTENT)
//        public void updateConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel) {
//
//            if (consoleViewModel == null || consoleViewModel.getId() < 1) {
//                throw new IllegalArgumentException("Id in path must match id in view model");
//            } else if (consoleViewModel.getId() > 0) {
//                service.updateConsole(consoleViewModel);
//            }
//        }
//
//        @DeleteMapping("/{id}")
//        @ResponseStatus(HttpStatus.NO_CONTENT)
//        public void deleteConsole(@PathVariable("id") long consoleId) {
//            service.deleteConsole(consoleId);
//        }
//
//        @GetMapping("/manufacturer/{manufacturer}")
//        @ResponseStatus(HttpStatus.OK)
//        public List<ConsoleViewModel> getConsoleByManufacturer(@PathVariable("manufacturer") String manu) {
//            List<ConsoleViewModel> cvmByManufacturer = service.getConsoleByManufacturer(manu);
//            if (cvmByManufacturer == null || cvmByManufacturer.isEmpty()) {
//                throw new IllegalArgumentException("No consoles, manufactured by " + manu + ", were found");
//            } else
//                return cvmByManufacturer;
//        }
//
//        @GetMapping()
//        @ResponseStatus(HttpStatus.OK)
//        public List<ConsoleViewModel> getAllConsoles() {
//            List<ConsoleViewModel> cvmByManufacturer = service.getAllConsoles();
//            if (cvmByManufacturer == null || cvmByManufacturer.isEmpty()) {
//                throw new IllegalArgumentException("No consoles were found");
//            } else
//                return cvmByManufacturer;
//        }
//    }
}