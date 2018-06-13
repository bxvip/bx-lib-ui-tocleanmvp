package co.bxvip.ui.tocleanmvp.base;


/**
 * <pre>
 *     author: vic
 *     time  : 18-1-9
 *     desc  : co.bxvip.ui.tocleanmvp.base fragment
 * </pre>
 */

public abstract class BaseMvpFragment<P extends BasePresenter> extends BaseFragment {

    public P presenter;

    @Override
    public void initView() {

    }

    @Override
    protected void justForInitPresenter() {
        super.justForInitPresenter();
        initPresenter();
    }

    @Override
    protected void lazyLoad() {
        super.lazyLoad();
        presenter.start();
    }

    protected abstract void initPresenter();
}
