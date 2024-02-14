import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBeahaviour{
    private List<Actor> queue;

    public Market(List<Actor> queue) {
        this.queue = queue;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        System.out.println(actor + " выбирает товары");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for(Actor actor:actorList){
            queue.remove(actor);
            System.out.println(actor + " ушел из магазина");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor + " добален в очередь");
    }

    @Override
    public void takeOrders() {
        for(Actor actor:queue){
            if(!actor.isMakeOrder){
                actor.setMakeOrder(true);
                System.out.println(actor + " сделал заказ");
            }
        }

    }

    @Override
    public void giveOrders() {
        for(Actor actor:queue){
            if(actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor + " забрал заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> queueReleaseActors = new ArrayList<>();
        for(Actor actor:queue){
            if(actor.isTakeOrder){
                queueReleaseActors.add(actor);
                System.out.println(actor + " стоит в очереди на выход");
            }
        }
        releaseFromMarket(queueReleaseActors);
    }
}
