@Controller
public class HotelController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/saveHotel", method = RequestMethod.POST)
    public String saveHotel(@ModelAttribute Hotel hotel, Model model) {
        String url = "http://localhost:8081/api/hotels"; // HotelMicroservice endpoint

        // Make POST request to HotelMicroservice
        ResponseEntity<Hotel> response = restTemplate.postForEntity(url, hotel, Hotel.class);
        model.addAttribute("hotel", response.getBody());

        return "success"; // you can create a success.jsp to show the hotel details
    }

    @GetMapping("/addHotel")
    public String showForm(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "hotel";
    }
}
