import java.util.List;

// The class for days, windowSize, and prices.
public class FileContent {
	private int days;
	private int windowSize;
	private List<Integer> prices;
	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getWindowSize() {
		return windowSize;
	}
	public void setWindowSize(int windowSize) {
		this.windowSize = windowSize;
	}
	public List<Integer> getPrices() {
		return prices;
	}
	public void setPrices(List<Integer> prices) {
		this.prices = prices;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("days: ").append(days).append("\n");
		sb.append("windowSize: ").append(windowSize).append("\n");
		sb.append("prices: ").append(prices);
		return sb.toString();
	}
}
