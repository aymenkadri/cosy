package fr.sfeir.client.ui.client;

import java.util.ArrayList;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import fr.sfeir.client.activity.EspaceClientActivity;
import fr.sfeir.client.ui.util.ButtonCellList;
import fr.sfeir.client.ui.util.IconUtils;
import fr.sfeir.shared.pro.Souscripteur;

public class EspaceClientView extends Composite implements
		EspaceClientActivity.IEspaceClientView {

	private static EspaceClientViewUiBinder uiBinder = GWT
			.create(EspaceClientViewUiBinder.class);

	interface EspaceClientViewUiBinder extends
			UiBinder<Widget, EspaceClientView> {
	}

	private EspaceClientActivity presenter;

	@UiField(provided = true)
	CellTable<Souscripteur> cellSouscripteur;

	public EspaceClientView() {
		cellSouscripteur = new CellTable<Souscripteur>(
				Souscripteur.KEY_PROVIDER);
		initCellColumns();
		initWidget(uiBinder.createAndBindUi(this));
	}

	private void initCellColumns() {
		// ButtonCell.
		Column<Souscripteur, String> detailColumn = addColumn(
				new ButtonCellList(), IconUtils.getDetailIcon(),
				new GetValue<String>() {
					@Override
					public String getValue(Souscripteur adrDto) {
						return " ";
					}
				}, new FieldUpdater<Souscripteur, String>() {

					@Override
					public void update(int index, Souscripteur souscripteur,
							String value) {
						if (souscripteur.getId() != null) {
							presenter.onDetailSituationEnCours();
						}
					}
				});
		detailColumn.setCellStyleNames("cellSoucripteur");
		cellSouscripteur.addColumn(detailColumn, IconUtils.getDetailIcon());

		Column<Souscripteur, String> nomColumn = new Column<Souscripteur, String>(
				new TextCell()) {

			@Override
			public String getValue(Souscripteur object) {
				return "Madama " + object.getNom() + " " + object.getPrenom();
			}
		};
		
		nomColumn.setCellStyleNames("cellSoucripteur");
		cellSouscripteur.addColumn(nomColumn, "Souscripteur ");
		cellSouscripteur.setColumnWidth(nomColumn, 25, Unit.PCT);

		Column<Souscripteur, String> contratColumn = new Column<Souscripteur, String>(
				new TextCell()) {

			@Override
			public String getValue(Souscripteur object) {
				return object.getNumeroContrat();
			}
		};
		contratColumn.setCellStyleNames("cellSoucripteur");
		cellSouscripteur.addColumn(contratColumn, "Contrat ");
		cellSouscripteur.setColumnWidth(contratColumn, 25, Unit.PCT);
		
		Column<Souscripteur, String> dateEffetColumn = new Column<Souscripteur, String>(
				new TextCell()) {

			@Override
			public String getValue(Souscripteur object) {
				return object.getDateEffetContrat();
			}
		};
		dateEffetColumn.setCellStyleNames("cellSoucripteur");
		cellSouscripteur.addColumn(dateEffetColumn, "Date d'eefet ");
		cellSouscripteur.setColumnWidth(dateEffetColumn, 25, Unit.PCT);
		
		Column<Souscripteur, Number> valorisationColumn = new Column<Souscripteur, Number>(
				new NumberCell()) {

			@Override
			public Number getValue(Souscripteur object) {
				return object.getValorisationEncours();
			}
		};
		valorisationColumn.setCellStyleNames("cellSoucripteur");
		cellSouscripteur.addColumn(valorisationColumn, "Valorisation (€) ");
		cellSouscripteur.setColumnWidth(valorisationColumn, 25, Unit.PCT);
		
	}

	private static interface GetValue<C> {
		C getValue(Souscripteur eleve);
	}

	private <C> Column<Souscripteur, C> addColumn(Cell<C> cell,
			SafeHtml headerHtml, final GetValue<C> getter,
			FieldUpdater<Souscripteur, C> fieldUpdater) {
		Column<Souscripteur, C> column = new Column<Souscripteur, C>(cell) {

			@Override
			public C getValue(Souscripteur object) {
				return getter.getValue(object);
			}
		};
		column.setFieldUpdater(fieldUpdater);
		return column;
	}

	@Override
	public void setPresenter(EspaceClientActivity presenter) {
		this.presenter = presenter;
	}

	@Override
	public void setData(ArrayList<Souscripteur> souscripteurs) {
		this.cellSouscripteur.setRowData(souscripteurs);
	}

}
