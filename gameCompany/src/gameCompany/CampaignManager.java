package gameCompany;

public class CampaignManager implements ICampaignService{

	@Override
	public void beginNewCampaign(Campaign campaign) {
	System.out.println("New "+campaign.getName() + "begins today ");
		
	}

	@Override
	public void endCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+ " Offically ended today");
		
	}

	

}
