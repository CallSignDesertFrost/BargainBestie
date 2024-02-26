// PriceComparisonController.java
@PostMapping("/compare")
public String comparePrices(@RequestParam String url, Model model) {
    // Implement web scraping logic using Jsoup
    // Compare prices and find the lowest one
    String lowestPrice = scrapeAndFindLowestPrice(url);

    // Store the result in a model attribute
    model.addAttribute("lowestPrice", lowestPrice);

    return "result";
}

private String scrapeAndFindLowestPrice(String url) {
    // Implement web scraping logic using Jsoup
    // Example: (This is a simplified example, actual implementation may vary)
    try {
        Document document = Jsoup.connect(url).get();
        // Parse the document and extract prices
        // Compare prices and find the lowest one
        // Return the lowest price
    } catch (IOException e) {
        e.printStackTrace();
        return "Error occurred while fetching prices.";
    }
}
